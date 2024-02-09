# aula-de-ED-dia-08.02.2024
Aula de estrutura de dados 
Exemplo: 

Criar a interface Tributavel, que tem como método (abstrato)
getValorTributo( ) /* retorna o valor do imposto do produto */

Criar a classe abstrata Produto, que implementa a interface Tributavel e que terá como
atributos:
int codigo /* código do produto */
String descrição /* descrição do produto */
double preco /* preço do produto */
Deve ter o construtor e os métodos getters e setters.

Criar a classe Alimento, herdeira de Produto
int quantVitamina /* quantidade de vitaminas */
Deve ter o construtor.

E deve implementar o método getValorTributo( ), que calcula o imposto de ICMS sobre o
alimento, que é 15% do preço do alimento.

Criar a classe Perfume, herdeira de Produto

String fragrancia /* fragrância do perfume */
Deve ter o construtor.
E deve implementar o método getValorTributo( ), que calcula o imposto de ICMS sobre o
perfume, que é 27% do preço do perfume.

Criar a classe Servico, que implementa a interface Tributavel
String descricao /* descrição do serviço */
double preco /* preço do serviço */
Deve ter o construtor.
E deve implementar o método getValorTributo( ), que calcula o imposto de ISS sobre o
serviço, que é 12% do preço do serviço.

Criar a classe Tributo , que tem como atributos:

ArrayList<Tributavel> listaTrib; /* arrayList de itens tributáveis */
O construtor da classe Tributo cria o objeto correspondente ao ArrayList trib.
A classe Tributo deve ter os métodos:

adicionaTributavel(Tributavel t) /* adiciona um item tributável no array de
 tributáveis */
 
double calculaTotalTributo( ) /* calcula o total dos tributos dos itens
 armazenados */
 
void exibeTodos( ) /* exibe todos os itens armazenados na lista de tributáveis */

Criar a classe TestaTributo que terá o método main

Crie um objeto do tipo Alimento e inicialize seus atributos.
Crie um objeto do tipo Perfume e inicialize seus atributos.
Crie um objeto do tipo Servico e inicialize seus atributos.
Crie um objeto do tipo Tributo e adicione o alimento, o perfume e o servico criados à lista
de tributáveis.
(se preferir, crie mais objetos Alimento, Perfume e Servico e adicione-os à lista)
Chame o método exibeTodos() para exibir todos os itens armazenados na lista.
Chame o método calculaTotalImposto( ) e exiba qual é o valor total dos impostos dos itens
armazenados.
