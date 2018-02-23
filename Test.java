public class Test{
    public static void main(String[] args){
        
    }

    public static Node different (Node frontL1, Node frontL2){
        Node ptr1 = frontL1;
        Node ptr2 = frontL2;

        Node res = new Node (0, null);
        Node res_ptr = res;

        while (ptr1 != null){
            if (ptr2 == null){
                // create new nodes and shove them on the end of res_ptr
            }

            if (ptr1.data < ptr2.data){
                add_L1(ptr1, res_ptr, ptr2.data);
            } else if (ptr1.data > ptr2.data){
                find_L2_next(ptr2, ptr1.data);
            } else{
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }

        return res.next;
    }

    private void add_L1(Node L1_ptr, Node, res_ptr, int target){
        while(L1_ptr != null){
            if (L1_ptr.data >= target){
                return;
            }
            Node n = new Node (L1_ptr.data, null);
            res_ptr.next = n;
            res_ptr = res_ptr.next;
            ptr = ptr.next;

        }
    }

    private void find_L2_next(Node ptr2, int target){
        while(ptr2 != null){
            if(ptr2.data >= target){
                return;
            }
            ptr2 = ptr2.next;
        }
    }
}
