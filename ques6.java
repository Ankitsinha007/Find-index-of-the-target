import java.util.ArrayList;

public class ques6 {
    public static void main(String[] args) {
        int [] arr = {3,2,12,0,18,0};
        int target = 1;
       int ans =find(arr,target, 0);
        System.out.println(ans);

        System.out.println(check(arr,target,0));

        findallindex(arr, target,0);
        System.out.println(list);

    }
    static boolean check(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target) || check(arr, target, index+1);
    }

    static int find(int [] arr, int target,int index){
        if (index == arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        return find(arr, target, index+1);
    }

    static ArrayList<Integer>list = new ArrayList<>();
    static void findallindex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        findallindex(arr, target, index+1);
    }

}
