## Mars Rover

You’re part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet. Develop an API that translates the commands sent from earth to instructions that are understood by the rover.

# Requirements


* You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.
* The rover receives a character array of commands.
* Implement commands that move the rover forward/backward (f,b).
* Implement commands that turn the rover left/right (l,r).
* Implement wrapping at edges. But be careful, planets are spheres.
* Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point, aborts the sequence and reports the obstacle.

# Polar coordinate system: Thinking in maps and planets

This interpretation of the grid system lends itself to the concept of latitude and longitude. The sphere is sliced into an even number of latitudes (equidistant lines) and longitudes (evenly spaced lines from North to South pole).
In this model, X and Y become abstract representations of longitudes and latitudes.

While the model might be the first one people arrive at if they’re coming from the mental models of planets and maps, it produces some significant edge cases that make this solution rather challenging.

This interpretation is vastly more complex, but can be tamed by constraining the solution to the following aspects:

* The number of latitudes and longitudes is the same and a multiple of 2
* x and y are positive integers. Positions not on the grid can not exist.
* The poles are not “on the grid”. The rover moves “over” the pole but never rests on them.


Source:
https://neopragma.com/wp-content/uploads/2020/04/Prime-Factors-Kata.pdf