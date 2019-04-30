package com.ifkaar;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

public class FutureTest {


    // future with string
    public CompletableFuture<Integer> stringTest() {
        CompletableFuture<Integer> tmp = new CompletableFuture<>();
        tmp.complete(7);
        return tmp;
    }


    public Integer test() {

        final AtomicReference<Integer> reference = new AtomicReference<>();

        CompletableFuture<Integer> test = stringTest()
                .whenComplete((result, exception) -> {
                    if (exception == null) {
                        test2(result);
                        reference.set(result);

                    } else {
                        System.out.println("exception:" + exception);

                    }
                }
        );
        return reference.get();
    }

    private void test2(Integer tmp) {
        System.out.println("result:" + tmp);
    }

}