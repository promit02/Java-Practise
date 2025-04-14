import java.util.*;
public class TrainingCompetition{


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int MPCS[][]= new int[3][3];
//int avg[]=new int[3];
for(int i =0;i<3;i++){
	for(int j=0;j<3;j++){
		MPCS[i][j]=sc.nextInt();
		if(1>MPCS[i][j]|| MPCS[i][j]>100){
			MPCS[i][j]=0;
			
		}
	}
}


int sum = 0;
int avg=0;
for(int i =0;i<3;i++){
	for(int j=0;j<3;j++){
		sum+=MPCS[i][j];
		
	}
	avg = sum/9;
}
float Mavg=avg;
if(Mavg<70){
	System.out.println("All trainees unfit");
}
for(int i =0;i<3;i++){
    for(int j=0;j<3;j++){
		if(Mavg<MPCS[i][j]){
			System.out.println(" the trainers are :"+(j+1));
		}
    }	
}

 

}
}