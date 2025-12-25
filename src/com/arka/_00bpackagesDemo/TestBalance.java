package com.arka._00bpackagesDemo;

import _00Telusko._00bpackagesDemo.MyPack.*;
import com.arka._00bpackagesDemo.MyPack.Balance;

public class TestBalance{
    public static void main(String[] args)
    {
        Balance test=new Balance("S.Dutta",99.88);
        test.show();
        String a = test.name;
    }
}