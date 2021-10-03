select * from estados

select sigla, nome as 'Nome do Estado' from estados
WHERE regiao = 'Sul'

select nome, regiao, populacao from estados
WHERE populacao>= 10
order by populacao desc