
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutPut {
    Map<Integer,char []> map=new HashMap();

    public List<List<String>> init(int arr[]){
            List<List<String>> list = new ArrayList<List<String>>();
            List<String> listSub2 = new ArrayList<String>();
            List<String> listSub3 = new ArrayList<String>();
            List<String> listSub4 = new ArrayList<String>();
            List<String> listSub5 = new ArrayList<String>();
            List<String> listSub6 = new ArrayList<String>();
            List<String> listSub7 = new ArrayList<String>();
            List<String> listSub8 = new ArrayList<String>();
            List<String> listSub9 = new ArrayList<String>();
            listSub2.add("A");
            listSub2.add("B");
            listSub2.add("C");
            listSub3.add("D");
            listSub3.add("E");
            listSub3.add("F");
            listSub4.add("G");
            listSub4.add("H");
            listSub4.add("I");
            listSub5.add("J");
            listSub5.add( "K");
            listSub5.add( "L");
            listSub6.add("M");
            listSub6.add("N");
            listSub6.add("O");
            listSub7.add( "P");
            listSub7.add("Q");
            listSub7.add( "R");
            listSub7.add( "S");
            listSub8.add( "T");
            listSub8.add( "U");
            listSub8.add( "V");
            listSub9.add("W");
            listSub9.add( "X");
            listSub9.add( "Y");
            for (int i = 0; i < arr.length; i++) {
                switch (arr[i]){
                    case 2:list.add(listSub2);break;
                    case 3:list.add(listSub3);break;
                    case 4:list.add(listSub4);break;
                    case 5:list.add(listSub5);break;
                    case 6:list.add(listSub6);break;
                    case 7:list.add(listSub7);break;
                    case 8:list.add(listSub8);break;
                    case 9:list.add(listSub9);break;
                }
            }
            List<List<String>> result = new ArrayList<List<String>>();
            descartes(list, result, 0, new ArrayList<String>());
            return result;
        }

    private static void descartes(List<List<String>> lists, List<List<String>> result, int layer, List<String> curList) {
        if (layer < lists.size() - 1) {
            if (lists.get(layer).size() == 0) {
                descartes(lists, result, layer + 1, curList);
            } else {
                for (int i = 0; i < lists.get(layer).size(); i++) {
                    List<String> list = new ArrayList<String>(curList);
                    list.add(lists.get(layer).get(i));
                    descartes(lists, result, layer + 1, list);
                }
            }
        } else if (layer == lists.size() - 1) {
            if (lists.get(layer).size() == 0) {
                result.add(curList);
            } else {
                for (int i = 0; i < lists.get(layer).size(); i++) {
                    List<String> list = new ArrayList<String>(curList);
                    list.add(lists.get(layer).get(i));
                    result.add(list);
                }
            }
        }
    }

    public static void main(String[] args) {
        OutPut outPut=new OutPut();
        int numbers[]={2,3,4,5};
        System.out.println( outPut.init(numbers));
    }


}