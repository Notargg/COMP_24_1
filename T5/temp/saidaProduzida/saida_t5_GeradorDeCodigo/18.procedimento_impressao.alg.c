#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void proc_imprime(char* mensagem){
printf("%s", mensagem);
printf("%s", "\n");
}
int main() {
proc_imprime("teste");
return 0; 
}
