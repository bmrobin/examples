class StringExamples

  # attr_reader :getOnly
  # attr_writer :setOnly
  attr_accessor :name

  # default class constructor
  def initialize
    self.name = "blah"
  end

  def print_string
    puts(self.name)
  end

  def eq?(input_name)
    input_name == self.name
  end

end
