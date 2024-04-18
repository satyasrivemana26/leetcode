  class ListNode {
      int val;
     ListNode next;
     ListNode(int x) {
        val=x;
     } 
  public static ListNode deserialize(String s){
    int a=s.length()-1;
        String[] values=s.substring(1,a).split(",");
        ListNode dum=new ListNode(0);
        ListNode current=dum;
        for(String val:values){
            current.next=new ListNode(Integer.parseInt(val));
            current=current.next;
        }
        return dum.next;

      }
          }
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
 ListNode dummy =new ListNode(0);
 ListNode p=l1,q=l2, current=dummy;
 int carry=0;
 while(p!=null|| q!= null){
    int x=(p != null) ?p.val:0;
    int y=(q !=null)?q.val:0;
    int sum=carry+x+y;
    carry=sum/10;
    current.next=new ListNode(sum %10);
    current=current.next;
    if(p!=null)p=p.next;
    if(q!= null)q=q.next;
 }  
 if(carry>0){
    current.next=new ListNode(carry); 
 }             
 return dummy.next;
    }
   public static void main(String args[]){
    ListNode l1=ListNode.deserialize("2,4,3");
    ListNode l2=ListNode.deserialize("5,6,4");
    Solution solution=new Solution();
    ListNode result=solution.addTwoNumbers(l1,l2);
    while(result != null){
        System.out.println(result.val+" ");
        result=result.next;
    }
   }
}
