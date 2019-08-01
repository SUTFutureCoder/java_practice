package opensearch_test;


import com.alibaba.fastjson.JSON;
import com.aliyun.opensearch.DocumentClient;
import com.aliyun.opensearch.OpenSearchClient;
import com.aliyun.opensearch.SearcherClient;
import com.aliyun.opensearch.sdk.dependencies.com.google.common.collect.Lists;
import com.aliyun.opensearch.sdk.dependencies.com.google.gson.JsonObject;
import com.aliyun.opensearch.sdk.dependencies.org.json.JSONArray;
import com.aliyun.opensearch.sdk.dependencies.org.json.JSONObject;
import com.aliyun.opensearch.sdk.generated.OpenSearch;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchClientException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchResult;
import com.aliyun.opensearch.sdk.generated.search.Aggregate;
import com.aliyun.opensearch.sdk.generated.search.Config;
import com.aliyun.opensearch.sdk.generated.search.SearchFormat;
import com.aliyun.opensearch.sdk.generated.search.SearchParams;
import com.aliyun.opensearch.sdk.generated.search.general.SearchResult;
import com.aliyun.opensearch.search.SearchParamsBuilder;
import opensearch_test.dto.MarketingDetailDTO;

import java.util.HashMap;
import java.util.List;


/**
 * @author xingchen.lin
 * @desc
 * @time 2019/7/26 5:56 PM.
 */
public class SearchClient {

    private static String appName = "opensearch";
    private static String accessKey = "LTAIk0l";
    private static String secret = "h27wUX";
    private static String host = "http://opensearch-cn-qingdao.aliyuncs.com";

    public static void main(String[] args) {
        // 创建并构建OpenSearch对象
        OpenSearch openSearch = new OpenSearch(accessKey, secret, host);

        // 创建OpenSearchClient对象，并以OpenSearch对象作为构造参数
        OpenSearchClient serviceClient = new OpenSearchClient(openSearch);

        // 创建SearcherClient对象，并以OpenSearchClient对象作为构造参数
        SearcherClient searcherClient = new SearcherClient(serviceClient);

        // 定义config对象，用于设定config子句参数，分页或数据返回格式，指定应用名等
        Config config = new Config(Lists.newArrayList(appName));
        config.setStart(0);
        config.setHits(2);
        config.setHits(0);

        // 设置返回格式为FULLJSON
        config.setSearchFormat(SearchFormat.FULLJSON);

        // 创建参数对象
        SearchParams searchParams = new SearchParams(config);

//        searchParams.setQuery("default:'abc'");

        try {
//            DocumentClient documentClient = new DocumentClient(serviceClient);
//            String tableName = "test1";
//            String data = "[{\"cmd\":\"add\", \"fields\":{\"id\":1,\"test1\":\"abc123123123\"}}]";
//            OpenSearchResult osr = documentClient.push(data, appName, tableName);
//            System.out.println(osr.toString());

            SearchParamsBuilder paramsBuilder = SearchParamsBuilder.create(searchParams);
            paramsBuilder.addFilter("participate_id=2300950914697", "AND");
            paramsBuilder.addFilter("start_time>=1563962396000", "AND");
            paramsBuilder.addFilter("end_time<=1563962396000", "AND");

            SearchResult searchResult = searcherClient.execute(paramsBuilder);
            String result = searchResult.getResult();
            JSONObject obj = new JSONObject(result);
            System.out.println(obj.toString());
            Integer num = obj.getJSONObject("result").getInt("total");
            System.out.println(num);
            JSONArray jsonArray = obj.getJSONObject("result").getJSONArray("items");
            for (int i = 0; i < jsonArray.length(); i++) {
                System.out.println(jsonArray.get(i));
                MarketingDetailDTO marketingDetailDTO = JSON.parseObject(obj.getJSONObject("result").getJSONArray("items").getJSONObject(i).get("fields").toString(), MarketingDetailDTO.class);
                System.out.println(marketingDetailDTO);
            }
            System.out.println(jsonArray);
//            System.out.println(obj.get());
            System.out.println(obj.toString());

//            Aggregate agg = new Aggregate();
//            agg.setGroupKey("detail_id");
//            agg.setAggFilter("count()");
//            searchParams.addToAggregates(agg);
//            paramsBuilder = SearchParamsBuilder.create(searchParams);
//            SearchResult searchResultAgg = searcherClient.execute(paramsBuilder);
//            JSONObject objAgg = new JSONObject(searchResultAgg);
//            System.out.println(objAgg.toString());

        } catch (OpenSearchException e) {
            e.printStackTrace();
        } catch (OpenSearchClientException e) {
            e.printStackTrace();
        }

    }


}
