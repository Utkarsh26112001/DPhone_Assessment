package com.markets.dao;

import com.markets.service.Referral;

import java.util.ArrayList;
import java.util.Scanner;

public class ReferralDao {
    public static ArrayList<Referral> ReferralData = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ReferralDao() {
    }

    public static ArrayList<Referral> getData() {
        return ReferralData;
    }

    public void dummyData() {

        ReferralData.add(new Referral(101, "Sudarshan", 9000));
        ReferralData.add(new Referral(102, "Sumit", 4000));
        ReferralData.add(new Referral(103, "Atharva", 1900));

    }

    public void displayReferral() {
        for (Referral referral : ReferralData) {
            System.out.println(referral);
        }
    }

    public void addReferral() {
        System.out.print("Enter the referral id::");
        int rid = sc.nextInt();
        System.out.print("Enter the referral name::");
        String rname = sc.next();
        System.out.print("Enter the referral salary::");
        int salary = sc.nextInt();
        boolean ridCheck = false;
        for (Referral r : ReferralData) {
            if (r.getRid() == rid) {
                ridCheck = true;
                break;
            }
        }
        if (!ridCheck) {
            ReferralData.add(new Referral(rid, rname, salary));
        } else {
            System.out.println("This Referral ID is already Present");
        }

    }

    public void deleteReferral() {
        System.out.println("\nEnter the record you want to delete:: ");
        int rId = sc.nextInt();
        for (int i = 0; i < ReferralData.size(); i++) {

            if (ReferralData.get(i).getRid() == rId) {
                ReferralData.remove(i);
            }
        }

    }
}
