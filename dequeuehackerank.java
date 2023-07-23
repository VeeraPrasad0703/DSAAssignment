    import java.util.*;
    public class dequeuehackerank {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (deque.size() == m) {
                int first = deque.removeFirst();
                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
            deque.addLast(num);
            if (!set.contains(num)) {
                set.add(num);
                
            }

            if (set.size() > max) {
                max = set.size();
            }
        }

        System.out.println(max);
            
        }
    }



