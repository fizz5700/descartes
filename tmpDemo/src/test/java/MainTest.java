import org.junit.Test;

import java.util.List;

public class MainTest {
    @Test
    public void test(){
        EnterText enterText=new EnterText();
        int numbers1[]={2};
        int numbers2[]={2,3};
        int numbers3[]={2,3,4};
        int numbers4[]={2,3,4,5,6,7,8,9};
        List<List<String>> content1 = enterText.getContent(numbers1);
        List<List<String>> content2 = enterText.getContent(numbers2);
        List<List<String>> content3 = enterText.getContent(numbers3);
        List<List<String>> content4 = enterText.getContent(numbers4);
        for (int i = 0; i < content1.size(); i++) {
            for (int j = 0; j < content1.get(i).size(); j++) {
                System.out.print(content1.get(i).get(j));
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < content2.size(); i++) {
            for (int j = 0; j < content2.get(i).size(); j++) {
                System.out.print(content2.get(i).get(j));
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < content3.size(); i++) {
            for (int j = 0; j < content3.get(i).size(); j++) {
                System.out.print(content3.get(i).get(j));
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < content4.size(); i++) {
            for (int j = 0; j < content4.get(i).size(); j++) {
                System.out.print(content4.get(i).get(j));
            }
            System.out.print(" ");
        }
       // System.out.println( enterText.getContent(numbers));
    }

}
