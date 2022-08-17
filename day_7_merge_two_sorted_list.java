class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode ansHead = new ListNode();
        ListNode ans = ansHead;
        if (list1.val < list2.val) {
            ans.val = list1.val;
            ans.next = new ListNode();
            list1 = list1.next;
        }
        else {
            ans.val = list2.val;
            ans.next = new ListNode();
            list2 = list2.next;
        }
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                ans.next = list2;
                break;
            }
            if (list2 == null) {
                ans.next = list1;
                break;
            }
            if (list1.val < list2.val) {
                ans.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else {
                ans.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            ans = ans.next;
        }
        return ansHead;
    }
        
    }
