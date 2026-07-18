#include<stdio.h>
#include<string.h>
typedef struct{
    char name[20];
    char abb[20];
    char class[20];
    double standard[20];
}unit_t;
unit_t unit[20];
int count=0;
find_unit(char str[20]){
    for (int i=0;i<count;i++);
    if(strcmp(unit[i].name,str)||strcmp(unit[i].abb,str)=0){
        return i;
    }
        else {
        printf("error");
        return -1;
        }
    }
        int main(){
            FILE*fp;
            fp=fopen("unit.txt,"r");
                while(fscanf("%s%s%s%f",unit[count].name,unit[count].abb,unit[count].class,&unit[count].standard)!=EOF){
                count++;
                }
                fclose(fp);
                int quan;
                char old_unit;
                char new_unit;
                printf("enter conversion problem");
                scanf("%d",&quan);
                scanf("%s%s",old_unit,new_unit);
                int old_index=find_unit(old_unit);
                int new_index=find_unit(new_unit);
                if(old_index== -1||new_index==-1) {
                printf("error");
                return 1;
            }
                if(strcmp(unit[old_index].class,unit[new_index].calss)!=0){
                printf("errors")
                return 1;
                }
                printf("conversion from old units to new unit");
                int result=quan*unit[old_index].standard/unit[new_index].standard;
                printf("the final coversion is %d",reslut);
                return 0;
            }
        }
    