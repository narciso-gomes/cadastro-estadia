# Cadastro Estadia

Caro(a) estudante!

Temos por certo que os desafios sempre contribuem para a aquisição de conhecimentos e competências desejadas. Assim, faz-se necessário relacionar o que se aprende com situações reais que podem ser encontradas no cotidiano. Nesta atividade, você é convidado(a) a realizar uma atividade para verificar como a disciplina em questão pode contribuir na sua experiência e formação profissional. 

Atente-se para as informações e realize um ótimo trabalho!
-----------------

Um shopping instalou uma nova atração para as crianças, uma área grande com cama elástica e outras atividades, o custo é controlado pelo tempo que a criança fica no brinquedo. Os responsáveis podem deixar a criança lá enquanto fazem compra no shopping, pois tem cuidadores especializados. Precisa-se de um sistema para fazer o cadastro, controle e a cobrança das horas utilizadas pela criança e, para isso, como desenvolvedor Java, você foi designado a criar um cadastro e controle de cobrança para este shopping.

O sistema deve ser criado utilizando Java Swing, e o processo deve conter três telas que serão executadas sequencialmente:

A Tela 1 deve armazenar dados do responsável.
A Tela 2 deve armazenar dados da criança.
A Tela 3 deve armazenar dados do tempo no brinquedo, bem como mostrar o resumo da utilização e o valor a ser cobrado.

Esse programa deve ser desenvolvido utilizando os conceitos de Orientação a Objetos, portanto deve ter as classes:

- Responsável com nome, CPF, telefone, e-mail, endereço e idade.
- Criança com Responsável, nome, idade e sexo.
- Estadia com Responsável, Criança e tempo utilizado.

O programa deve seguir as seguintes regras:

Para ser responsável, a pessoa tem que ser maior de idade, portanto, no cadastro de idade, é necessário verificar se a idade é igual ou superior a 18.
Para a criança poder brincar ela tem que ter menos de 10 anos, portanto, no cadastro, é necessário verificar se a idade da criança é igual ou menor que 10.
Para estadia, deve ser cobrado o valor do minuto (R$1,50); para tempo superior a 20 minutos deve conceder 5% de desconto; para mais de 40 minutos conceder 10%; e mais de 60 minutos conceder 15% de desconto.

Observações:

- Essas regras devem ser implementadas nos métodos das classes do domínio, sepa
