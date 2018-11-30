package com.drools.cartoons;

import java.util.List;

public class Result {
    List<String> cartoons;

    public List<String> getCartoons() { return cartoons; }

    public void setCartoons(List<String> cartoons) { this.cartoons = cartoons; }

    public Result(List<String> cartoons){
        this.cartoons = cartoons;
    }

    public void showCartoons(){
        for(String ans : this.getCartoons())
            System.out.println(ans);
    }
}
