package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
    	
    	int size=q.length(); 
    	 
    	for(int i=0;i<size;i++) {
    		T a=q.serve();
    		if(i%2==0) {
    			
    			eq.enqueue(a);
    		}
  
    		else
    			oq.enqueue(a);
    		
    		q.enqueue(a);
    	}
    	
    	
 
    }
    public static <T> void remove(LinkedPQ<T> pq, int p) {
    	
    	int size=pq.length();
    	for(int i=0;i<size;i++) {
    		PQElement<T> element =pq.serve();
    		if(element.p>=p) {
    			pq.enqueue(element.data, element.p);
    		}
    		
    		
    		
    	}
    	
    	
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
    	
    if(!st.empty()) {
	
     T temp=st.pop();
    
    
    if(temp.equals(e)) {
    	st.push(temp);
    	return true;
    	}
  
    	boolean a=search(st,e);
    	st.push(temp);
    	return a;
    	
    }
    
    
    return false;
    	
  
    }
}