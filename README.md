# bux

A money and currency manipulation library for Clojure

[![Build Status](https://secure.travis-ci.org/pelle/bux.png)](http://travis-ci.org/pelle/bux)

## Usage

Add the following to your project.clj

    [bux "0.2.1"]

### Currencies

    (use 'bux.currency)

Create a custom currency using create-currency:

    (create-currency {:symbol "★", :name "Super points", :iso-code "super-points"})
    => #bux.currency.Currency{:iso-code "super-points", :name "Super points", :symbol "★", :subunit nil, :symbol-first nil, :html-entity nil, :iso-numeric nil, :decimal-points nil, :priority nil}


Load up predefined currencies:

    (use 'bux.currencies)

This adds all current national currencies to the bux.currencies namespace using the ISO code as the symbol.

    USD
    => #bux.currency.Currency{:iso-code "USD", :name "United States Dollar", :symbol "$", :subunit "Cent",  :symbol-first true, :html-entity "$", :iso-numeric "840", :priority 1}

Based on current locale it places the default currency in $

    $
    => #bux.currency.Currency{:iso-code "USD", :name "United States Dollar", :symbol "$", :subunit "Cent",  :symbol-first true, :html-entity "$", :iso-numeric "840", :priority 1}

The var bux.currencies/$ is dynamically bindable so you could bind a different value to it for different users in a ring request.

Note currency list lifted from [Ruby Money](http://rubymoney.github.com/money/)

### Money

Money is basically BigDecimals set at the scale required for the currency.

To create a proper BigDecimal from either string or number use the currency as a function:

    (USD 1.23)
    => 1.23M

    (USD 1.234M)
    => 1.23M

    (USD "$1.23")
    => 1.23M

Or using the default currency:

    ($ 1.23)
    => 1.23M

    ($ 1.234M)
    => 1.23M

    ($ "$1.23")
    => 1.23M

To format it without a symbol just use clojure's built in str function

    (str (USD 1.23))
    => "1.00"

To format it with a symbol use the str$ function:

    (str$ USD 1.23M)
    => "$1.23"

Parse strings directly:

    (parse$ USD "$1,123.00")
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

    (pct- USD 1.23M 10)
    => 1.11M

## License

Copyright (C) 2012 Pelle Braendgaard http://stakeventures.com

Distributed under the Eclipse Public License, the same as Clojure.
