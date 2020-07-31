
package client.server.model;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Server {
    
    protected int bankBalance=100000;
    Queue keylist=new LinkedList();
    Queue cmpl_keylist=new LinkedList();
    public void payment(int amount){
        bankBalance-=amount;
    }
    public void rstBalance(){
        bankBalance=100000;
    }
    public void clearQueue(){
        keylist.clear();
    }
    public void cmpl_payment(){
        cmpl_keylist.add(keylist.poll());
    }
   //int amount = s.
    
}
