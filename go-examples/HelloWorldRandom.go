package main

import "fmt"
import "math/rand"

func main() {
	compareString := []string { "h", "e", "l", "l", "o", ",", "w", "o", "r", "l", "d", "!" }

	var output []string

	fmt.Println("randomly solving:", compareString)

	i := 0

	for i < len(compareString){
		randomCharacter := compareString[rand.Intn(len(compareString))]
		if randomCharacter == compareString[i] {
			fmt.Println(randomCharacter)
			output = append(output, randomCharacter)
			i++
		}
	}

	fmt.Println("solved!", output)
}

