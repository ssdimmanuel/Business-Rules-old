package com.expr.brule.newtests;

import java.io.IOException;

import com.expr.brule.edits.RuleBalancer;
import com.expr.brule.pattern.RulePatternMatcher;

public class BalanceTest {

	public static void main(String[] args) throws IOException {
		String rule = "( ( ( AMOUNT > 200000.00) AND ( IND1 = Y) ) or ( ind1 = Y ) )";
		//rule= " ( AMOUNT = 1010.00 )";
		//rule=" AMOUNT > 200000.00 AND  IND1 = Y or  ind1 = Y ";
		
		RuleBalancer bal = new RuleBalancer(rule);
		bal.parseRule();
		
		System.out.println("Before: "+rule);
		System.out.println("After:  "+bal.getLatestRule().trim());
	}

}