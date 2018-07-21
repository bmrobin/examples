# using `require_relative` is preferred for local files, while `require` is preferred for external Gems
require_relative 'string'

# create instance object
example = StringExamples.new

# uses value from `initialize`
example.print_string

# because `name` is an attr_accessor we can get and set it publicly on the instance object
puts(example.name)
example.name = "Frank"
example.print_string

# object equality
puts(example.eq?("Frank"))
puts(example.name.equal?("Frank")) # false
puts(example.eq?("Dennis"))

# raw ID of this object instance
puts(example.name.object_id)

# class reflection
method = example.public_method('print_string')
method.call
