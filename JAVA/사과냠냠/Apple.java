public class Apple {
    
	int count;//사과 수량
	
	public int getAppleCount(){ //현재 사과 수량
		return this.count;
	}
	
	public void buyApple(int count){ //구매한 사과
		System.out.println("사과를 "+count+"개 구매했어요~");
		this.count += count;
	}
	
	public void eatApple(int count){ //먹은 사과
		if(this.count >= count){
			System.out.println("사과를 "+count+"개 먹었어요~");
			this.count -= count;
		}else{
			System.out.println("호에엥 사과가 부족해요~! "+count+"개 만큼먹을 수 없어요~");
		}
		
	}
}