import java.lang.reflect.Array;
import java.util.*;

public class ArrayCC {
   
    


    // first = 0; last = arr.lenght -1   (while(first < last) temp = first  first last last  =temp  fir++ last--)

        public static void rev(int arr[]) {

               int first = 0;
               int last = arr.length-1;

               while ( first < last) {

                  int temp = arr[first];
                    arr[first] = arr[last];
                    arr[last] = temp;
                    first++;
                    last--;
                
               }
           

               
        }
      public static void main(String[] args) {

        int arr[] = {  1  , 2 , 3 , 4 ,5 };

            rev(arr);
            System.out.println(Arrays.toString(arr));
              
      }
   }