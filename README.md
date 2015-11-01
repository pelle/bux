# bux

A money and currency manipulation library for Clojure and ClojureScript

[![Build Status](https://secure.travis-ci.org/pelle/bux.png)](http://travis-ci.org/pelle/bux)

## Usage

Add the following to your project.clj

    [bux "0.3.0"]
    
Note there have been major breaking changes from 0.2.1 to 0.3.0. See below for details.

### ClojureScript

In ClojureScript it should work pretty much the same as Clojure. It is written using .cljc extension so you will need Clojure 1.7 or above for both Clojure and ClojureScript. 

### Currencies

    (require '[bux.core :as bux :refer [$])
    (require '[bux.currencies])

You can access all international currencies using the iso$ function in currencies

    (bux.currencies/iso$ :USD)
    => {:iso-code "USD", :name "United States Dollar", :symbol "$", :subunit "Cent",  :symbol-first true, :html-entity "$", :iso-numeric "840", :priority 1}

Based on current locale it places the default currency in currencies/default$

    bux.currencies/default$
    => {:iso-code "USD", :name "United States Dollar", :symbol "$", :subunit "Cent",  :symbol-first true, :html-entity "$", :iso-numeric "840", :priority 1}

The var bux.currencies/default$ is dynamically bindable so you could bind a different value to it for different users in a ring request.

If you need a full currency list for creating select boxes etc use bux.currencies/currencies:

    bux.currencies/currencies

Note currency list lifted from [Ruby Money](http://rubymoney.github.com/money/)

### Money

To format it without a symbol just use clojure's built in str function

    (format$ bux.currencies/default$ 1.23)
    => "1.00"

To format it with a symbol use the str$ function:

    ($ bux.currencies/default$ 1.23)
    => "$1.23"

Parse strings directly:

    (parse$ bux.currencies/default$ "$1,123.00")
    => 1123.00M

### Calculations

    (use 'bux.calc)

These can use the precision of a currency and take an optional currency parameter for calculating with correct precission.

Percentage:

    (pct 1.23M 10)
    => 0.12M

    (pct USD 1.231M 10)
    => 0.12M


With Percentage (can be used for including sales tax, commissions etc.):

    (pct+ 1.23M 10)
    => 1.35M

    (pct+ USD 1.23M 10)
    => 1.35M

Percentage discount:

    (pct- 1.23M 10)
    => 1.11<

    (pct- bux.currencies/default$ 1.23M 10)
    => 1.11M


## Breaking changes

The original library was written early on my clojure journey and still had some bad OO patterns. I have performed various cleanups that will absolutely break existing code. But it should be easy enough to update your code.

- Currencies are now just a map
- There are no longer vars for each currency. Use (bux.currencies/iso$ :USD) instead.
- bux.currencies/$ has been renamed to bux.currencies/default$

If you need to, continue using 0.2.1

## License

Copyright (C) 2012-2015 Pelle Braendgaard http://stakeventures.com

Distributed under the Eclipse Public License, the same as Clojure.
