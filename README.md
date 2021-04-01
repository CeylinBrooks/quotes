# quotes

./gradlew test succeeds but also fails at the same time.

App creates a new Gson and uses Reader to read the imbedded json file. `gson.fromJson` pulls the data from the json and feeds it through the Quote constructor and organizes it into arrays of author and text. Used a RNG of base 0 going to the length of the array to determine which at which index to pull both the author and the quote from.
