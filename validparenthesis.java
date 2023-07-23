import java.util.*;
class validparenthesis{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(validparenthesischeck(input));
		}
		
	}
       public static boolean validparenthesischeck(String input)
    {
        //Complete the code
            Stack<Character> s=new Stack<Character>();
            for(int i=0;i<input.length();i++)
            {
                Character a=input.charAt(i);
                if(a=='{' || a=='(' || a=='[')
                    s.push(a);
                if(s.empty())
                    return false;
                else if((a=='}' && s.peek()=='{')||(a==')' && s.peek()=='(') || (a==']'  && s.peek()=='['))
                    s.pop();
            }
            if(s.empty())
                return true;
            return false;
    }
    
}



