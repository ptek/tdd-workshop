# TDD Workshop

## TDD Base

Following the ideas from the excellent book on "understanding the 4 rules of simple design", by [Corey Haines](https://leanpub.com/4rulesofsimpledesign), we would play different setups to get a better in-depth feeling of how TDD works.

1. **Mute ping-pong pairing**

One member of the pair writes the unit tests, the other member writes the code to turn those tests green. You can think of the roles as “test redder” and “test greener.” This is standard. However, the only communication allowed between partners is through the tests and the code. And no cheating by putting a bunch of comments!

2. **Find the loophole**

Generally coupled with ping-pong pairing, one pair writes the tests, the other pair tries to get those tests passing. The catch is that the pair working to get the tests passing writes the wrong code. How long can you go before the tests force you into a “correct” algorithm. Here’s the catch, though: you must write production-level code, think of it as code you would show a prospective employer.

## Technical problem: Fizz-Buzz

>"Write a program that prints the numbers from 1 to 100. But for multiples of three return “Fizz” instead of the number and for the multiples of five return “Buzz”. For numbers which are multiples of both three and five return “FizzBuzz”."

## Fizz-Buzz complication

> Instead of prime numbers, return "Prizz"

## Tools

### Dependencies

* [Java 1.8+](https://java.com/en/download/mac_download.jsp) (If you have 10 installed already and set as your primary version that's fine too)
* Make sure you have JDK (Java Development Kit)
* gradle (can be installed with `brew install gradle`)
* Git

### Using the code

* to run the tests: `gradle test`
* to build the code: `gradle build`

