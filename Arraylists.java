import java.util.ArrayList;
import java.util.Collections;
 class Arraylists {
        public static void main(String args[]){
            ArrayList<Integer> list = new ArrayList<>();
            //add elements
            list.add(0);
            list.add(2);
            list.add(3);

            System.out.println(list);

            //get elements
            int ele=list.get(0);
            System.out.println(ele);


            //add elements in middle
            list.add(1,1);
            System.out.println(list);

            //set element
            list.set(2,5);
            System.out.println(list);

            //delete element
            list.remove(3);
            System.out.println(list);

            //size
            int size=list.size();
            System.out.println(size);

            //loops
            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i));
            }

            //sorting
            Collections.sort(list);
            System.out.println(list);

        }
    }
