package home.allan.groovy.lang

def max
def min = Math.min(max ?:11, 100)

assert min == 11
