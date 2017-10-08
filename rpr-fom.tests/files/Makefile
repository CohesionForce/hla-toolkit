include ../../makeinclude/make.config

LIBDIR = ../../lib/$(BUILDNAME)

all : create grab

% : %.cpp
	$(CXX) $(CPPFLAGS) $(CXXFLAGS) -O0 -g -I../../include/1516e -L$(LIBDIR) $(RPATH_FLAG)$(LIBDIR) $^ -lrti1516e$(EVOLVED_LIB_SUFFIX) -lfedtime1516e$(EVOLVED_LIB_SUFFIX) -o $@


clean:
	rm -f *.o create grab core core.*

