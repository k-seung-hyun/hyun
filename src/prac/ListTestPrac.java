package prac;

import java.util.ArrayList;

public class ListTestPrac {
	  public static void main(String[] args) {
	      ArrayList<Integer> nums = new ArrayList<>();
//	      nums.add(3);
//	      nums.add(2);
//	      nums.add(1);
//	      
//	      System.out.println(nums); //3,2,1
//	      
//	      int tmp = nums.get(2); // 새로운 공간에 2번방에 있는 숫자 1을 이동
//	      nums.set(2, nums.get(0)); // 기존 공간 0번방에 3을 2번방으로 이동 
//	      nums.set(0, tmp); // 새로운 공간에 있던 숫자 1을 0번방으로 이동
//	      
//	      System.out.println(nums);
//	      
//	      nums.add(3);
//	      nums.add(2);
//	      nums.add(1);
//	      nums.add(10);
//	      nums.add(7);
//	      nums.add(5);
//	      // System.out.println(nums);
//	      
//	      
//	      // !!nums.set(1, 2) == 2에 있는 숫자를 1에 저장
//	      
	//   
//	      // tmp라는 새로운 저장공간에 2번 방에 있는 숫자 1을 추가
//	      int tmp = nums.get(2); 
//	      System.out.println(nums);
//	      // 0번 방에 있는 숫자 3을 2번 방에 추가
//	      nums.set(2, nums.get(0));
//	      System.out.println(nums);
//	      // tmp에 있는 숫자 1을 0번 방에 추가
//	      nums.set(0, tmp);
//	      System.out.println(nums);
//	      
//	      // tmp에 5번방에 있는 숫자 5를 추가
//	      tmp = nums.get(5);
//	      // 3번 방에 있는 숫자 10을 5번 방에 추가
//	      nums.set(5, nums.get(3));
//	      System.out.println(nums);
//	      // tmp에 있는 숫자 5를 3번 방에 추가
//	      nums.set(3, tmp);
//	      System.out.println(nums);
	      
	      // 방의 현재 상황 (10,7,1,5)
	      nums.add(10);
	      nums.add(7);
	      nums.add(1);
	      nums.add(5);
	      
	      /*
	       * nums에서 제일 작은 값을 찾은 뒤에
	       * 0번째 방과 값을 바꾸고 출력하시오.
	       */
	      
	      //셀렉트 소트(선택 정렬)
	      
	      // min에 0번째 방에 있는 숫자 10을 추가
	      int min = nums.get(0);
	      
	      int idx = 0; // 방의 위치(번호) 값
	      /*
	       * nums의 size가 i보다 클때 i++, min의 값이 nums.get(i)보다 크면
	       * min에 nums.get(i)를 대입하고 idx = i 
	       */
	      for(int i=1;i<nums.size();i++) {
	         if(min>nums.get(i)) {
	            min = nums.get(i);
	            idx = i;
	         }
	      }
	      // tmp에 0번 방의 숫자 
	      int tmp = nums.get(0);
	      nums.set(0, nums.get(idx));
	      nums.set(idx, tmp);
	      System.out.println(nums);
	     
	   }
	}

