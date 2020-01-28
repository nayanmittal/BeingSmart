class SelectionSort
{

public static void main(String[] args)
{
InsertionSort();
}

public static void InsertionSort()
{
int a[]={0,5,30,19,21,4,2,8,3};
int n=a.length;
for(int i=0;i<n;i++)
{
int min=i;
for(int j=i+1;j<n;j++)
{
if(a[j]<a[min])
{min=j;}
}
 int temp=a[i];a[i]=a[min];a[min]=temp;
}

for(int i:a)
System.out.print(i+" ");



}

}