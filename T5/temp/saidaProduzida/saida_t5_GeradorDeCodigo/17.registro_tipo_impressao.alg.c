#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
typedef struct {
char* nome;
int idade;
} treg;
treg reg;
 reg.nome = "Maria";
 reg.idade = 30;
printf("%s", reg.nome);
printf("%s", " tem ");
printf("%d", reg.idade);
printf("%s", " anos");
return 0; 
}
