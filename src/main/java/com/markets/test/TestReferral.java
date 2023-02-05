package com.markets.test;

import com.markets.dao.ReferralDao;

import java.util.Scanner;

public class TestReferral {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ReferralDao referral = new ReferralDao();
        referral.dummyData();
        referral.displayReferral();

        //creating object for our referral
        System.out.println("Press 1 to add data");
        System.out.println("Press 2 to delete data");
        System.out.print("Enter the operation no::");

        int n = sc.nextInt();
        if (n == 1) {
            referral.addReferral();
            referral.displayReferral();


        } else if (n == 2) {
            referral.displayReferral();

            referral.deleteReferral();
            referral.displayReferral();
        }

    }
}
