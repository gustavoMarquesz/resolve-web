# resolve-web
Welcome! o Gestor empresarial RESOLVE, está com cara nova. O mesmo ganhou um versão web, depois de suas versões em terminal e desktop (ambas aqui no github).
Logo de cara, vemos funcionalidades familizares as dos seus irmãos, porém atualizadas e modernizadas. Podemos ver que a tabelea está com informações mais exutas, podendo ver mais detalhes clicando no link ao final da tabela.

![image](https://user-images.githubusercontent.com/29557719/228344112-38da64ef-f49e-41cd-b1ae-65eb64c4acb4.png)

Pronto! fomos redirecionados para mais detalhes, e a novidade é que aqui podemos vincular observações a esta ententidade! 
Podemos ver essa relação melhor, na tabela de nosso banco logo a baixo.

![image](https://user-images.githubusercontent.com/29557719/228344244-26f8e31d-2331-48b4-8f6b-b082ae6dca5c.png)

Podemos observar que podemos ter Várias observações para uma entendida e Uma entidade para muitas observações (@ManyToOne e @OneToMany) Podendo observar este comportamento nas observações de ID 2 e 3 que estão ligadas a empresa de ID 2. 
![image](https://user-images.githubusercontent.com/29557719/228344397-30cde161-dded-43fe-a557-bd63bdc5aaf8.png)

Em cadastro podemos ver que não mudaram as informações e validações, porém o detalhe está no campo nome. Ainda está na regra de negócio que precisamos do nome da pessoa que fez o cadastro, porém essa informação ainda não é exibida porque a regra foi um pouco modificada, agora os funcionários não veem quem registrou as empresas, e sim o admin. Pois é, o projeto vai contar com o lado do admin em breve, onde ele poderá editar e ver algumas informações privilegiadas. 

![image](https://user-images.githubusercontent.com/29557719/228344487-b558ff41-eccf-4741-b3c6-ae66835ee96f.png)

