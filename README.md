##Estrutura de Árvore Binária Genérica em Java

Este repositório contém a implementação de uma estrutura de dados de **Árvore Binária Genérica**, desenvolvida em Java como parte das atividades práticas da disciplina. 

O objetivo do projeto é consolidar os conceitos de manipulação de nós, métodos de travessia (caminhamento) e algoritmos de busca em estruturas ramificadas.


---

<details>
  
<summary> Especificações do Projeto </summary>

A implementação segue os seguintes requisitos técnicos:
*   **Estrutura Genérica:** Permite armazenar qualquer tipo de dado que implemente a interface `Comparable`, garantindo flexibilidade e reutilização de código.
*   **Regra de Inserção Alternada:** A inserção de novos elementos prioriza o preenchimento do **filho esquerdo** e, em seguida, do **filho direito** se o esquerdo já estiver ocupado.
*   **Busca Binária:** Implementação do algoritmo de busca para localização eficiente de elementos na árvore.

</details>

---

<details>
  
<summary> Métodos de Travessia Implementados </summary>


O projeto conta com os três principais modos de caminhamento em árvores de forma recursiva:
1.  **Pré-Ordem (Pre-order):** Visita a raiz, esquerda e direita.
2.  **Em Ordem (In-order):** Visita a esquerda, raiz e direita.
3.  **Pós-Ordem (Post-order):** Visita a esquerda, direita e raiz.


</details>

---

<details>

<summary> Estrutura de Arquivos </summary>

*   `No.java`: Classe que define o nó genérico da árvore, contendo o dado armazenado e as referências para os nós filhos (esquerdo e direito).
*   `Arvores.java`: Classe principal da estrutura, contendo a lógica de inserção, busca e as rotinas de travessia.
*   `Main.java`: Classe de execução utilizada para testar a inserção de dados, realizar as buscas e exibir os resultados dos caminhamentos no console.

</details>
