1. Run "Neo Data" run config
2. Look in `neoforge/build/classes` and observe that the classes in the datagen source set are not present.
  - Another element you may observe is that printing out the `modSourceSets` does show that the correct source sets are added
3. Run the task `neoforge:compileDatagenJava`
4. Running the "Neo Data" run will now succeed since the classes from the datagen source set are now compiled and were not deleted for being "stale"
