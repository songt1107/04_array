package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.printf("%d ", arr[i]);
		}	
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (i == 0 || i % 2 == 0) {
			sum += arr[i];		
			}
	
		}
		
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	
	}
	
	
	public void practice2() {
		
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			System.out.printf("%d ",arr[i]);
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum += arr[i];
			}
			
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
		
	}
	
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public void practice4() {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}

		
		boolean flag = false;
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				System.out.print("인덱스 : " + i);
				flag = true;
			}
			
		}	if (!flag) {
				System.out.print("일치하는 값이 존재하지 않습니다.");
			}
		
		
	}
	
	
	public void practice5() {
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < input.length(); i++) {
			
			if (arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}	
			System.out.println();
			System.out.println(ch + " 개수 : " + count);
		
	}
	
	
	public void practice6() {
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.print("\n총 합 : " + sum);
		
	}
	
	
	public void practice7() {
		
		System.out.print("주민등록번호(-포함)  :  ");
		String jumin = sc.nextLine();
		
		if(jumin.length() == 14 && jumin.charAt(6) == '-') {
			char[] arr = jumin.toCharArray();
			
			for (int i = 8; i < 14; i++) {
				arr[i] = '*';
			}
			System.out.print(new String(arr));
		}
	}
	
	
	public void practice8() {

		int input;
		
        while (true) {
        	
            System.out.print("정수: ");
            input = sc.nextInt();

            if (input >= 3 && input % 2 != 0) {
                
            	break;
            	
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
		int size = input;
		
		int[] arr = new int[size];
		
		int middle = size / 2;
		
		int value = 1;
		
		for(int i = 0; i <= middle; i++) {
			arr[i] = value;
			value++;
		}
		
		value = middle;
		
		for(int i = middle + 1; i < size; i++) {
			
			arr[i] = value;
			value--;
		}
		for(int i = 0; i < size; i++) {
			
			System.out.print(arr[i]);
			
			if(i < size -1) {
				
				System.out.print(", ");
				
			}
			
		}
		
	}
	
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
				arr[i] = random;
				
			for(int x = 0; x < i; x++) {
				
				if(random == arr[x]) {
					i--;
					break;
				}
			}
				
		}
		
		System.out.print("발생한 난수 : " + Arrays.toString(arr));
		
	}
	
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
				arr[i] = random; 	
				}
					int max = arr[0];
					int min = arr[0];
					
					
			for(int x = 0; x < arr.length; x++) {
						
						if( arr[x] > max) {
							max = arr[x];
						}
						
						if( arr[x] < min) {
							min = arr[x];
					}
			}
					System.out.println("발생한 난수 : " + Arrays.toString(arr));
					System.out.println("최대값 : " + max);
					System.out.println("최소값 : " + min);  
		
		}
	
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
				arr[i] = random;
		
			for(int x = 0; x < i; x++) {
				
				if(random == arr[x]) {
					i--;
					break;
				} 	
			}
		}
		
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
		
		
	}
	
	public void practice12() {
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			
			int random = (int)(Math.random() * 45 + 1);
			
			lotto[i] = random;
			
			for (int x = 0; x < i; x++) {
				
				if(random == lotto[x]) {	
					i -- ;
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		System.out.println( Arrays.toString(lotto));
	}
	
	
	public void practice13() {
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			 boolean exists = false;
			 
	            for (int j = 0; j < count; j++) {
	                if (arr[j] == ch) {
	                    exists = true;
	                    break;
	                }
	            }
	            if (!exists) {
	                arr[count] = ch;
	                count++;
	            }
			}
	        System.out.print("문자열에 있는 문자: ");
	        for (int i = 0; i < count; i++) {
	            System.out.print(arr[i] + ", ");
	        }
	        System.out.println();

	        System.out.println("문자 개수: " + count);
	        
	}
	
	
	public void practice14() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
        int index = 0;
        while (true) {
            System.out.print(index + 1 + "번째 문자열 : ");
            String input = sc.nextLine();
            arr[index] = input;
            index++;

            if (index >= size) {
                System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    break;
                } else if (answer.equalsIgnoreCase("y")) {
                    System.out.print("더 입력하고 싶은 개수: ");
                    int additionalSize = sc.nextInt();
                    sc.nextLine();
              
                    String[] newArray = new String[size + additionalSize];
                    System.arraycopy(arr, 0, newArray, 0, size);
                    arr = newArray;
                    size += additionalSize;
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
		
	}
	
	
	
}
