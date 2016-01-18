select concat(name, 
              case occupation
                when 'Doctor' then '(D)'
                when 'Professor' then '(P)'
                when 'Singer' then '(S)'
                when 'Actor' then '(A)' end )
            from Occupations order by name;

select 'There are total', count(*),
                                    case occupation
                                        when 'Doctor' then 'doctors.'
                                        when 'Singer' then 'singers.'
                                        when 'Actor' then 'actors.'
                                        when 'Professor' then 'professors.' end
                            from Occupations group by occupation order by (count(*));

