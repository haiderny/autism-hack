package com.ifkaar;

import java.util.concurrent.CompletableFuture;

public class Old {


    Old() {
        System.out.println("test2");
        FutureTest test = new FutureTest();
        test.test();
    }



    public static String xyz() {
        CompletableFuture<String> future =
                tmp();
        final String processed = "adfa";
        return processed;
    }

    public static CompletableFuture<String> tmp() {
        CompletableFuture<String> abc = new CompletableFuture<>();
        abc.complete("future");
        return abc;
    }
}
