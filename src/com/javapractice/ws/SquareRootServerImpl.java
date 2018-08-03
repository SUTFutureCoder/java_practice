package com.javapractice.ws;

import java.util.*;
import javax.jws.*;

@WebService(endpointInterface = "com.javapractice.ws.SquareRootServer")

public class SquareRootServerImpl implements SquareRootServer {

    @Override
    public double getSquareRoot(double input) {
        return Math.sqrt(input);
    }

    @Override
    public String getTime() {
        Date now = new Date();
        return now.toString();
    }
}
