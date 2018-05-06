package main

import "fmt"
import "math/rand"

func main() {
	compareString := []string { "h", "e", "l", "l", "o", ",", "w", "o", "r", "l", "d", "!" }

	// because we use a length that is calculated at runtime, we need
	// to dynamically size the slice based on the length using `make`
	length := len(compareString)
	output := make([]string, length)

	fmt.Println("randomly solving:", compareString)

	i := 0

	for i < len(compareString){
		randomCharacter := compareString[rand.Intn(len(compareString))]
		if randomCharacter == compareString[i] {
			fmt.Println(randomCharacter)
			output[i] = randomCharacter
			i++
		}
	}

	fmt.Println("solved!", output)
}

