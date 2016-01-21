open System

let function1(line) =
  for i in 1 .. line do
    let mutable x = 1
    printf "1 "
    for j in 1 .. (i-1) do
      x <- x * (i-j)/j
      printf "%d " x
    printf "\n"
function1(Console.ReadLine() |> int)
