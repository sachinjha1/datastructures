package com.walmart.s2jha.datastructures.stack;

import java.util.Stack;

public class PostfixCalculator {

	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < args.length; i++) {
			String item = args[i];
			boolean isItemNumeric = item.chars().allMatch(Character::isDigit);
			if (isItemNumeric) {
				stack.push(Integer.parseInt(item));
			} else {
				int rhs = stack.pop();
				int lhs = stack.pop();

				switch (item) {
				case "+":
					stack.push(lhs + rhs);
					break;
				case "-":
					stack.push(lhs - rhs);
					break;
				case "*":
					stack.push(lhs * rhs);
					break;
				case "/":
					stack.push(lhs / rhs);
					break;
				case "%":
					stack.push(lhs % rhs);
					break;
				default:
					throw new Exception("Unsupported operators");
				}
			}
		}
		
		System.out.println("Result is "+ stack);

	}

}
