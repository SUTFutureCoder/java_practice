package opensearch_test.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author xingchen.lin
 * @desc
 * @time 2019/8/1 12:23 AM.
 */

@Data
public class MarketingDetailDTO {

    @JSONField(name = "detail_id")
    private Long detailId;

    @JSONField(name = "alsc_detail_id")
    private Long alscDetailId;

}
