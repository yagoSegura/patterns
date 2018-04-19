package handler;

import java.util.Random;

public class Handler{
	private static Random s_rn = new Random();
	private static int s_next = 1;
	private int m_id = s_next++;
	private Handler m_next;

	public void add(Handler next){
		if(m_next == null){
			m_next = next;
		}else{
			m_next.add(next);
		}
	} 

	public void wrap_around(Handler root){
		if(m_next == null){
			m_next = root;
		}else{
			m_next.wrap_around(root);
		}
	}

	public void handle(int num){
		if(s_rn.nextInt(4) != 0){
			System.out.print(m_id + "-busy ");
			m_next.handle(num);
		}else{
			System.out.println(m_id + "-handled-"+num);
		}
	}
}