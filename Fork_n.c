/*Inserire un numero tra 1 e 4, generare tanti processi figli tramite ciclo for, per
ogni processo stampare il suo pid e quello del padre*/
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main(){
        pid_t pid;
        pid_t wpid;
        int i,n;
        do{
                printf("Inserire un numero tra 1 e 4: ");
                scanf("%d",&n);
        }while((n<1)||(n>4));
        printf("Sono il padre con pid %d e sto per generare i miei figli\n",getpid());
        for(i=0;i<n;i++){
                pid=fork();
                if(pid==0)
                        printf("Sono il figlio con pid:%d\nIl pid del padre e': %d\n",getpid(),getppid());
        }
}
