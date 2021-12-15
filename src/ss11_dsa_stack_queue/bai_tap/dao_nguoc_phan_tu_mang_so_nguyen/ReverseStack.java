package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_mang_so_nguyen;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("The stack before reverse and out :");
        System.out.println(stack);

        int begin = 0;
        int last = stack.size()-1;
        while(begin < last){
                int temp = stack.get(begin);
                stack.set(begin, stack.get(last));
                stack.set(last, temp);
                begin++;
                last--;
        }
        System.out.println("---------");

        System.out.println("The stack after reverse and out : ");
        System.out.println(stack);
    }
}
