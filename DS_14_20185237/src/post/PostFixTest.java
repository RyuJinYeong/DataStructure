package post;

public class PostFixTest {
	public static void main(String[] args)
	{
		String inFix = "13 + 7 * 5 + ( 2 - 3 ) * 7";
		String postFix = PostFix.makePostFix(inFix);
		System.out.println(postFix);
		System.out.println(PostFix.evalPostFix(postFix));
	}
}
