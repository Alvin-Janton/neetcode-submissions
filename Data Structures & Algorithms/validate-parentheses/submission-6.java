class Solution {
    public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
        if(s.length() == 1){
            return false;
        }
        else if(s.length() % 2 ==1){
            return false;
        }
		
		for(char c : s.toCharArray()) {
			if(c == '[' || c =='{' || c == '(') {
				stack.push(c);
			}
            else if((c==']' && stack.isEmpty()==true) || (c=='}' && stack.isEmpty()==true) || (c==')' && stack.isEmpty()==true)) {
				return false;
			}
			else if((c==']' && stack.peek()=='[') || (c=='}' && stack.peek()=='{') || (c==')' && stack.peek()=='(')){
				stack.pop();
			}
            else{
                return false;
            }
		}

        if(stack.isEmpty()){
            return true;
        }
		
		
		return false;
    }
}
