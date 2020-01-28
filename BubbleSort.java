class BubbleSort
{

public static void main(String[] args)
{
bubbleSort();
}

public static void bubbleSort()
{
int arr[]={5,3,1,2,4,8,0};
int n=arr.length;
for(int i=0;i<n;i++)
{
for(int j=1;j<n-i;j++)
{
int temp=0;
if(arr[j-1]>arr[j])
{temp=arr[j-1];arr[j-1]=arr[j];arr[j]=temp;  }
}
}

for(int i:arr)
System.out.print(i);



}

}